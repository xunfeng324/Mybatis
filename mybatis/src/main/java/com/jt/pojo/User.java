package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)//链式加载
@NoArgsConstructor//无参构造
@AllArgsConstructor//有残构造
public class User {
	private Integer id;
	private String name;
	private Integer age;
	private String sex;
	//222
}
