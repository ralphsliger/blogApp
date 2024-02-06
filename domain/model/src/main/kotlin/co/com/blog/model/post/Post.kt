package co.com.blog.model.post

import lombok.Builder
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
data class Post(
  //val anyField : Any?
) {
  //fun anyMethod():Any? { return null }
}
