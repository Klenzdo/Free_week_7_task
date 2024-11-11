package week_7_Task;

import week_7_Task.service.HttpServerServiceImpl;

import static week_7_Task.common.SimpleHttpServer.PORT;

public class Main {
    public static void main(String[] args) {

        HttpServerServiceImpl service = new HttpServerServiceImpl();

        service.start(PORT);
    }

    }

