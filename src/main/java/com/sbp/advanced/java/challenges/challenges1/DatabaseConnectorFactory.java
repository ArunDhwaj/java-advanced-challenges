package com.sbp.advanced.java.challenges.challenges1;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class DatabaseConnectorFactory {
    interface Connector {
        boolean connect();
        void disconnect();
    }

    private int totalNumberOfConnectors;
    private static int ctr = 1;

    public List<Connector> createConnectors(int portNumber,
                                            final String databaseAddress,
                                            int numberOfConnectors) {

        log.info("createConnectors: portNumber: " + portNumber + " , databaseAddress: " + databaseAddress + " , numberOfConnectors: " + numberOfConnectors);

        List<Connector> connectors = new ArrayList<>();

        for (int i = 0 ; i < numberOfConnectors; i++) {
            Connector connector = new Connector() {
                int y = 0;
                int x2 = 1;

//               public Connector() {
//                    log.info("Database connector number: %d", ctr++);
//                }

                @Override
                public boolean connect() {
                    // Not yet implemented
                    totalNumberOfConnectors = 2;
                    x2 = portNumber;
                    String dbAddress = databaseAddress;
//                    int z = i;
                    System.out.println("Database connector number: {{ctr++}}");
                    return true;
                }

                @Override
                public void disconnect() {
                    // Not yet implemented
                }
            };
            connector.connect();
            connectors.add(connector);
        }
        return connectors;
    }
}