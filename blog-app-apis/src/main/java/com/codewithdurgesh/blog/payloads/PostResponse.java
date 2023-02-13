package com.codewithdurgesh.blog.payloads;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
public class PostResponse {
	
	
	private List<PostDto> content;
	private int pageNumber;
	private int pageSize;
	private long totalElements;
	private boolean lastPage;
	private long totalPages;
	

}
