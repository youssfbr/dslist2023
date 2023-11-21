package com.github.youssfbr.dslist.repositories;

import com.github.youssfbr.dslist.entities.Game;
import com.github.youssfbr.dslist.projections.IGameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IGameRepository extends JpaRepository<Game, Long> {


	@Query(nativeQuery = true, value = """
					SELECT 
						g.id, 
						g.title, 
						g.game_year AS gameYear, 
						g.img_url AS imgUrl,
						g.short_description AS shortDescription, 
						b.position
					FROM tb_game g
					INNER JOIN tb_belonging b 
						ON g.id = b.game_id
					WHERE b.list_id = :listId
					ORDER BY b.position
			""")
	List<IGameMinProjection> searchByList(Long listId);
}
