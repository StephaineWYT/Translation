package wen.translation;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("ajax.php?a=fy&f=zh&t=en")
    Observable<Translation> getCall(@Query("w") String w);

}

