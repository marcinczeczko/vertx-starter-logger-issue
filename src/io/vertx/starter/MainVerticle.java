package io.vertx.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

public class MainVerticle extends AbstractVerticle {
 private static final Logger LOGGER = LoggerFactory.getLogger(MainVerticle.class);

  @Override
  public void start() {
    LOGGER.info("Starting HTTP server");
    vertx.createHttpServer()
        .requestHandler(req -> req.response().end("Hello Vert.x !"))
        .listen(8080);
  }

}
