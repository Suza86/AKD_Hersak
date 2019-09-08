package com.akd.akd;

import com.akd.akd.AkdData;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import java.util.List;

public class AkdApplication {

	public static void main(String[] args) throws IOException {

        String fileName = "C:/Users/Sue/workspace/akd/akd/src/main/resources/akd.csv";
        Path path = Paths.get(fileName);
        System.out.println(path.toAbsolutePath());

        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {

        	HeaderColumnNameMappingStrategy strategy  = new HeaderColumnNameMappingStrategy<>();
            strategy.setType(AkdData.class);

            CsvToBean csvToBean = new CsvToBeanBuilder(br)
                    .withType(AkdData.class)
                    .withMappingStrategy(strategy)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<AkdData> akdcsv = csvToBean.parse();
            
			for (int i = 0; i < akdcsv.size(); i++) {
				System.out.println(akdcsv.get(i));
			}
        }
    }
}
