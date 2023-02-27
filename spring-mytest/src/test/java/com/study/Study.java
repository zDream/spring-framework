package com.study;

import com.study.config.Config;
import com.study.entity.Person;
import com.study.entity.User;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhutongtong
 * @date 2022/6/24 18:08
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = Config.class)
public class Study {

//	@Resource
//	Person person;
//	@Resource
//	UserDao userDao;


	@Test
	void test2(){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Person person = context.getBean("person", Person.class);

		String name = person.getName();
		System.out.println(name);
//		UserDao userDao = context.getBean(UserDao.class);
//		User byId = userDao.getById(1);

		//hack
		User user = new User();
		user.setName("小张");
		user.setEmail("qq.com");
		user.setId(4);
//		userDao.insertUser(user);

		System.out.println();

		System.out.println("123");
		System.out.println("7894561235");
	}


//	@Test
	void test3(){




//		转换为数组：
//[{"id":"1", "parentId":null},
//		{"id":"2", "parentId":"1"},
//		{"id":"3", "parentId":"1"}]

		List<Tree> child3 = new ArrayList<>();
		child3.add(new Tree("3"));

		Tree tree2 = new Tree();
		tree2.id = "2";
		tree2.children = child3;
		List<Tree> child = new ArrayList<>();
		child.add(tree2);

		Tree tree = new Tree();
		tree.id = "1";
		tree.children =child;

		System.out.println("test33");

		List<Node> nodeList = new ArrayList<>();
		treeToList(nodeList,tree,null);

		System.out.println(nodeList);
	}

	class Node{
		String id;
		String parentId;
	}

	class Tree{
		String id;
		List<Tree> children;

		public Tree(){}
		public Tree(String id){
			this.id = id;
		}
	}

	public void treeToList(List<Node> nodeList,Tree tree,String parentId) {
		Node node = new Node();
		node.id = tree.id;
		node.parentId = parentId;
		nodeList.add(node);
		if(tree.children == null || tree.children.size() == 0){
			return;
		}

		tree.children.forEach(k->{
			treeToList(nodeList,k,tree.id);
		});

	}

	public static void main(String[] args) {
		Study study = new Study();
		study.test3();
	}
}
