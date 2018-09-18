# CoolWeatherV2
Android第一行代码 第二版 实战天气项目

## 天气数据格式
点击具体的县，查看天气情况，返回数据格式如下
```
{
	"HeWeather": [{
		"basic": {
			"cid": "CN101180201",
			"location": "安阳",
			"parent_city": "安阳",
			"admin_area": "河南",
			"cnty": "中国",
			"lat": "36.10344315",
			"lon": "114.35248566",
			"tz": "+8.00",
			"city": "安阳",
			"id": "CN101180201",
			"update": {
				"loc": "2018-09-17 16:46",
				"utc": "2018-09-17 08:46"
			}
		},
		"update": {
			"loc": "2018-09-17 16:46",
			"utc": "2018-09-17 08:46"
		},
		"status": "ok",
		"now": {
			"cloud": "49",
			"cond_code": "101",
			"cond_txt": "多云",
			"fl": "22",
			"hum": "51",
			"pcpn": "0.0",
			"pres": "1019",
			"tmp": "22",
			"vis": "9",
			"wind_deg": "16",
			"wind_dir": "东北风",
			"wind_sc": "2",
			"wind_spd": "6",
			"cond": {
				"code": "101",
				"txt": "多云"
			}
		},
		"daily_forecast": [{
			"date": "2018-09-17",
			"cond": {
				"txt_d": "多云"
			},
			"tmp": {
				"max": "23",
				"min": "17"
			}
		}, {
			"date": "2018-09-18",
			"cond": {
				"txt_d": "小雨"
			},
			"tmp": {
				"max": "20",
				"min": "17"
			}
		}, {
			"date": "2018-09-19",
			"cond": {
				"txt_d": "中雨"
			},
			"tmp": {
				"max": "21",
				"min": "17"
			}
		}, {
			"date": "2018-09-20",
			"cond": {
				"txt_d": "多云"
			},
			"tmp": {
				"max": "25",
				"min": "15"
			}
		}, {
			"date": "2018-09-21",
			"cond": {
				"txt_d": "晴"
			},
			"tmp": {
				"max": "26",
				"min": "12"
			}
		}, {
			"date": "2018-09-22",
			"cond": {
				"txt_d": "晴"
			},
			"tmp": {
				"max": "24",
				"min": "12"
			}
		}, {
			"date": "2018-09-23",
			"cond": {
				"txt_d": "晴"
			},
			"tmp": {
				"max": "22",
				"min": "10"
			}
		}],
		"hourly": [{
			"cloud": "31",
			"cond_code": "101",
			"cond_txt": "多云",
			"dew": "12",
			"hum": "79",
			"pop": "7",
			"pres": "1020",
			"time": "2018-09-17 19:00",
			"tmp": "21",
			"wind_deg": "71",
			"wind_dir": "东北风",
			"wind_sc": "1-2",
			"wind_spd": "10"
		}, {
			"cloud": "41",
			"cond_code": "101",
			"cond_txt": "多云",
			"dew": "13",
			"hum": "83",
			"pop": "7",
			"pres": "1021",
			"time": "2018-09-17 22:00",
			"tmp": "19",
			"wind_deg": "87",
			"wind_dir": "东风",
			"wind_sc": "1-2",
			"wind_spd": "9"
		}, {
			"cloud": "78",
			"cond_code": "101",
			"cond_txt": "多云",
			"dew": "14",
			"hum": "85",
			"pop": "43",
			"pres": "1021",
			"time": "2018-09-18 01:00",
			"tmp": "18",
			"wind_deg": "170",
			"wind_dir": "南风",
			"wind_sc": "1-2",
			"wind_spd": "9"
		}, {
			"cloud": "79",
			"cond_code": "305",
			"cond_txt": "小雨",
			"dew": "15",
			"hum": "87",
			"pop": "53",
			"pres": "1019",
			"time": "2018-09-18 04:00",
			"tmp": "17",
			"wind_deg": "190",
			"wind_dir": "南风",
			"wind_sc": "1-2",
			"wind_spd": "11"
		}, {
			"cloud": "83",
			"cond_code": "305",
			"cond_txt": "小雨",
			"dew": "15",
			"hum": "87",
			"pop": "25",
			"pres": "1020",
			"time": "2018-09-18 07:00",
			"tmp": "18",
			"wind_deg": "105",
			"wind_dir": "东南风",
			"wind_sc": "1-2",
			"wind_spd": "7"
		}, {
			"cloud": "96",
			"cond_code": "305",
			"cond_txt": "小雨",
			"dew": "16",
			"hum": "79",
			"pop": "20",
			"pres": "1019",
			"time": "2018-09-18 10:00",
			"tmp": "18",
			"wind_deg": "177",
			"wind_dir": "南风",
			"wind_sc": "1-2",
			"wind_spd": "10"
		}, {
			"cloud": "100",
			"cond_code": "101",
			"cond_txt": "多云",
			"dew": "17",
			"hum": "79",
			"pop": "71",
			"pres": "1019",
			"time": "2018-09-18 13:00",
			"tmp": "19",
			"wind_deg": "171",
			"wind_dir": "南风",
			"wind_sc": "1-2",
			"wind_spd": "4"
		}, {
			"cloud": "100",
			"cond_code": "101",
			"cond_txt": "多云",
			"dew": "18",
			"hum": "82",
			"pop": "66",
			"pres": "1017",
			"time": "2018-09-18 16:00",
			"tmp": "20",
			"wind_deg": "186",
			"wind_dir": "南风",
			"wind_sc": "1-2",
			"wind_spd": "11"
		}],
		"aqi": {
			"city": {
				"aqi": "94",
				"pm25": "65",
				"qlty": "良"
			}
		},
		"suggestion": {
			"comf": {
				"type": "comf",
				"brf": "舒适",
				"txt": "白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"
			},
			"sport": {
				"type": "sport",
				"brf": "适宜",
				"txt": "天气较好，赶快投身大自然参与户外运动，尽情感受运动的快乐吧。"
			},
			"cw": {
				"type": "cw",
				"brf": "不宜",
				"txt": "不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"
			}
		}
	}]
}
```