package com.levelup.java;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * 공통 유틸리티 메서드를 제공하는 클래스입니다.
 *
 * <p>
 * 이 클래스는 콘솔에 출력할 때 사용되는 다양한 유틸리티 메서드를 제공합니다.
 * </p>
 */
public class CommonUtils {

    /**
     * 콘솔에 구분선을 출력합니다.
     */
    public static void splitLine() {
        System.out.println("================================================================================");
    }

    /**
     * 주어진 리스트를 JSON 형식으로 변환하여 콘솔에 출력합니다.
     *
     * @param list JSON으로 변환할 객체 리스트
     * @param <T>  리스트의 요소 타입
     */
    public static <T> void print(List<T> list) {
        final Gson gson = new GsonBuilder().setPrettyPrinting()
                                           .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())
                                           .create();
        System.out.println(gson.toJson(list));
    }

    /**
     * LocalDateTime 객체를 JSON 형식으로 변환하기 위한 어댑터 클래스입니다.
     */
    private static class LocalDateTimeAdapter extends TypeAdapter<LocalDateTime> {

        private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

        /**
         * LocalDateTime을 문자열로 변환하여 JSON에 기록합니다.
         *
         * @param out   JSON 기록자
         * @param value 변환할 LocalDateTime 객체
         * @throws IOException 기록 중 입출력 오류가 발생할 수 있습니다.
         */
        @Override
        public void write(JsonWriter out, LocalDateTime value) throws IOException {
            out.value(value.format(formatter));
        }

        /**
         * 문자열을 읽어 LocalDateTime 객체로 변환합니다.
         *
         * @param in JSON 판독기
         * @return 변환된 LocalDateTime 객체
         * @throws IOException 판독 중 입출력 오류가 발생할 수 있습니다.
         */
        @Override
        public LocalDateTime read(JsonReader in) throws IOException {
            return LocalDateTime.parse(in.nextString(), formatter);
        }
    }

}