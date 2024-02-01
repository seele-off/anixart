// virtual methods
.method public abstract addToBlockList(JLjava/lang/String/;)Lio/reactivex/Observable;
.param p1 # J
.annotation runtime Lretrofit2/http/Path;
value = "id"
.end annotation
.end param

// Method 1 | Добавить пользователя в черный список
.annotation runtime Lretrofit2/http/GET;
value = "profile/blocklist/add/{id}" // full getUrl = https://api.anixart.tv/profile/blocklist/add/{id}
.end annotation
.end method

// Method 2 | Удаление пользователя из черного списка
.annotation runtime Lretrofit2/http/GET;
value = "profile/blocklist/remove/{id}" // full getUrl = https://api.anixart.tv/profile/blocklist/remove/{id}
.end annotation
.end method

