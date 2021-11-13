package demo.excel.demo.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.stereotype.Component;

import demo.excel.demo.model.FileUpload;

@Component(value = "fileupload")
@ELBeanName(value = "fileupload")
@Join(path = "/", to = "/fileupload-form.jsf")
@ManagedBean(name = "fileUploadController", eager = true)
@SessionScoped
public class FileUploadController implements Serializable {
	private FileUpload fileUpload;

}
