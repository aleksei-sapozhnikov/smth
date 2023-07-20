package com.github.vermucht.smth.exception.handler;

import com.github.vermucht.smth.exception.bean.EmployeeErrorBean;
import java.util.NoSuchElementException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandlers {

  @ExceptionHandler(NoSuchElementException.class)
  public ResponseEntity<EmployeeErrorBean> handlerException(NoSuchElementException e) {
    EmployeeErrorBean data = new EmployeeErrorBean(e.getMessage());
    return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(Throwable.class)
  public ResponseEntity<EmployeeErrorBean> handlerThrowable(Throwable t) {
    EmployeeErrorBean data = new EmployeeErrorBean(t.getMessage());
    return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
