package com.epic.addean.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

class AddEanControllerTest {
    /**
     * Method under test: {@link AddEanController#getUploadForm(Model)}
     */
    @Test
    void testGetUploadForm() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [uploadform]: would dispatch back to the current handler URL [/uploadform] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1405)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1149)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1088)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:964)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:201)
        //   In order to prevent getUploadForm(Model)
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getUploadForm(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        AddEanController addEanController = new AddEanController();

        // Act and Assert
        assertEquals("uploadform", addEanController.getUploadForm(new ConcurrentModel()));
    }

    /**
     * Method under test: {@link AddEanController#postUploadForm(MultipartFile, Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPostUploadForm() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.epic.addean.service.UploadService.startAddEan(org.springframework.web.multipart.MultipartFile)" because "this.uploadService" is null
        //       at com.epic.addean.controller.AddEanController.postUploadForm(AddEanController.java:39)
        //   In order to prevent postUploadForm(MultipartFile, Model)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   postUploadForm(MultipartFile, Model).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        AddEanController addEanController = new AddEanController();
        MockMultipartFile file = new MockMultipartFile("Name", "AAAAAAAA".getBytes("UTF-8"));

        // Act
        addEanController.postUploadForm(file, new ConcurrentModel());
    }

    /**
     * Method under test: {@link AddEanController#postUploadForm(MultipartFile, Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPostUploadForm2() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.toString()" because "file" is null
        //       at com.epic.addean.controller.AddEanController.postUploadForm(AddEanController.java:38)
        //   In order to prevent postUploadForm(MultipartFile, Model)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   postUploadForm(MultipartFile, Model).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        AddEanController addEanController = new AddEanController();
        MockMultipartFile file = new MockMultipartFile("Name", "AAAAAAAA".getBytes("UTF-8"));

        // Act
        addEanController.postUploadForm(file, new ConcurrentModel());
    }
}

