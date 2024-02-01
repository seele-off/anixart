url: api.anixart.tv/profile/{id}

{
"code": 0,
"profile": {
"id": 1,
"login": "Seele",
"avatar": "https://anixstatic.com/avatars/token(.jpg или .gif",
"status": "string",
"badge": null,
"history": [],
"votes": [],
"last_activity_time": unix timestamp (number),
"register_date": unix timestamp (number),
"vk_page": "string",
"tg_page": "string",
"inst_page": "string",
"tt_page": "string",
"discord_page": "string",
"ban_expires": unix timestamp (number),
"ban_reason": string (Отображается как null),
"privilege_level": number,
"watching_count": number,
"plan_count": number,
"completed_count": number,
"hold_on_count": number,
"dropped_count": number,
"favorite_count": number,
"comment_count": number,
"collection_count": number,
"video_count": number,
"friend_count": number,
"subscription_count": number,
"watched_episode_count": number,
"watched_time": number,
"is_private": boolean (true или false),
"is_sponsor": boolean (true или false),
"is_banned": boolean (true или false),
"is_perm_banned": boolean (true или false),
"is_bookmarks_transferred": boolean (true или false),
"is_sponsor_transferred": boolean (true или false),
"is_vk_bound": boolean (true или false),
"is_google_bound": boolean (true или false),
"is_release_type_notifications_enabled": boolean (true или false),
"is_episode_notifications_enabled": boolean (true или false),
"is_first_episode_notification_enabled": boolean (true или false),
"is_related_release_notifications_enabled": boolean (true или false),
"is_report_process_notifications_enabled": boolean (true или false),
"is_comment_notifications_enabled": boolean (true или false),
"is_my_collection_comment_notifications_enabled": boolean (true или false),
"is_my_article_comment_notifications_enabled": boolean (true или false),
"is_verified": boolean (true или false),
"watch_dynamics": [],
"friend_status": null,
"rating_score": number,
"is_blocked": boolean (true или false),
"is_me_blocked": boolean (true или false),
"is_stats_hidden": boolean (true или false),
"is_counts_hidden": boolean (true или false),
"is_social_hidden": boolean (true или false),
"is_friend_requests_disallowed": boolean (true или false),
"is_online": boolean (true или false),
"roles": [],

  // Вот так вглядит полный структура
  "roles": [
{
"id": 1,
"name": "Разработчик мода",
"color": "B656E5"
}
],
// Конец
  
"sponsorshipExpires": number
},
"is_my_profile": boolean (true или false)
}
