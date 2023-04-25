//// ANIXART USERS ////
anixart = users
//// Method ////
iget-object v0, p0, Lcom/seele/anixart/Prefs;->a:Landroid/content/SharedPreferences;

    const-string v1, "IS_SPONSOR"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    const/4 v0, 0x1

    return v0
.end method
//// End ////

//// anixart fragment version ////

[ {
"id":"1","functional":
  "isSponsor": "true", <!--In case of change-->
  "is_sponsor": "truе",
  "isVerified": "true", <!--In case of change-->
  "is_verified": "true",
} ]

[ {
"id":"2","XTremove":
 "isSponsor": "false", <!--In case of change-->
  "is_sponsor": "false",
  "isVerified": "false", <!--In case of change-->
  "is_verified": "false",
 } ]
