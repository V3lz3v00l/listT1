package com.example.michael.listt1;


import java.util.List;

public class TItem {
    private String status;
    private Integer totalResults;
    private List<Article> articles = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

}

class Source {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

/*
{
	"status": "ok",
	"totalResults": 10,
	"articles": [
		{
			"source": {
				"id": "bbc-news",
				"name": "BBC News"
			},
			"author": "BBC Sport",
			"title": "Jacksonville Jaguars: Four players arrested at London nightclub for 'unpaid bar bill'",
			"description": "Four Jacksonville Jaguars players are arrested on suspicion of trying to leave a London nightclub without paying a large bar bill.",
			"url": "http://www.bbc.co.uk/sport/american-football/46008877",
			"urlToImage": "https://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/1500A/production/_104062068_jacksonvillejaguarsgetty.jpg",
			"publishedAt": "2018-10-28T09:23:14Z",
			"content": "The Jacksonville Jaguars will be making their sixth successive appearance at Wembley for an NFL game Four Jacksonville Jaguars players were arrested on Saturday after allegedly trying to leave a London nightclub without paying a large bar bill. Police were ca… [+1305 chars]"
		},
		{
			"source": {
				"id": "bbc-news",
				"name": "BBC News"
			},
			"author": "BBC News",
			"title": "Maori greeting for Meghan and Harry",
			"description": "The Duke and Duchess of Sussex arrive in New Zealand - the last stop on their 16-day tour.",
			"url": "http://www.bbc.co.uk/news/world-asia-pacific-46008507",
			"urlToImage": "https://ichef.bbci.co.uk/news/1024/branded_news/D3D2/production/_104062245_megharnz_afpgetty.jpg",
			"publishedAt": "2018-10-28T08:35:41Z",
			"content": "Image copyright AFP/Getty Image caption The royal couple performed a hongi upon arrival in Wellington The Duke and Duchess of Sussex have been welcomed to New Zealand with a traditional Maori greeting. They received a hongi, where they rubbed noses with Maori… [+2498 chars]"
		},
		{
			"source": {
				"id": "bbc-news",
				"name": "BBC News"
			},
			"author": "BBC News",
			"title": "'Synagogue shooter' charged with murder",
			"description": "The Pittsburgh attack killed 11 and is said to be the worst anti-Semitic attack in recent US history.",
			"url": "http://www.bbc.co.uk/news/world-us-canada-46007707",
			"urlToImage": "https://ichef.bbci.co.uk/images/ic/1024x576/p06q2l1h.jpg",
			"publishedAt": "2018-10-28T04:59:43Z",
			"content": "Media caption \"It's a horrific crime scene. One of the worst, and I've been on plane crashes\" A man suspected of killing 11 people in a synagogue in Pittsburgh has been charged with murder - in what is believed to be the worst anti-Semitic attack in recent US… [+7304 chars]"
		},
		{
			"source": {
				"id": "bbc-news",
				"name": "BBC News"
			},
			"author": "BBC News",
			"title": "Higgins wins second term as Irish president",
			"description": "Irish people also vote overwhelmingly to remove blasphemy as an offence from the constitution.",
			"url": "http://www.bbc.co.uk/news/world-europe-45999270",
			"urlToImage": "https://ichef.bbci.co.uk/images/ic/1024x576/p06q2kph.jpg",
			"publishedAt": "2018-10-27T22:57:12Z",
			"content": "Media caption 'We can achieve so much together' Michael D Higgins has been re-elected as Irish president after receiving 56% of the country's election vote. Businessman Peter Casey came second with 23.1%, while none of the other four candidates polled more th… [+3097 chars]"
		},
		{
			"source": {
				"id": "bbc-news",
				"name": "BBC News"
			},
			"author": "BBC News",
			"title": "'It's a horrific crime scene. One of the worst'",
			"description": "Pittsburgh's Squirrel Hill community speak of their shock following a fatal shooting in a local synagogue.",
			"url": "http://www.bbc.co.uk/news/world-us-canada-46005051",
			"urlToImage": "https://ichef.bbci.co.uk/news/1024/branded_news/E993/production/_104059795_p06q2l1h.jpg",
			"publishedAt": "2018-10-27T22:02:52Z",
			"content": null
		},
		{
			"source": {
				"id": "bbc-news",
				"name": "BBC News"
			},
			"author": "BBC News",
			"title": "What we know about the shooting",
			"description": "What we know so far about the shooting at the Tree of Life Congregation Synagogue in Pittsburgh.",
			"url": "http://www.bbc.co.uk/news/world-us-canada-46003665",
			"urlToImage": "https://ichef.bbci.co.uk/news/1024/branded_news/564F/production/_104059022_050229352.jpg",
			"publishedAt": "2018-10-27T22:01:04Z",
			"content": "Image copyright Reuters Image caption Residents were advised to stay at home after the shooting A gunman has entered a Pittsburgh synagogue and opened fire, killing 11 people. Four officers are among six others injured at the Tree of Life Congregation in Squi… [+4464 chars]"
		},
		{
			"source": {
				"id": "bbc-news",
				"name": "BBC News"
			},
			"author": "BBC News",
			"title": "Leicester City owner's helicopter crashes",
			"description": "Leicester City owner's helicopter crashes in car park outside the club's ground shortly after taking off after match",
			"url": "http://www.bbc.co.uk/news/uk-england-leicestershire-46006470",
			"urlToImage": "https://ichef.bbci.co.uk/news/1024/branded_news/533A/production/_104060312_hi050235060.jpg",
			"publishedAt": "2018-10-27T20:09:25Z",
			"content": "Image copyright Rex Features Image caption A picture taken outside Leicester City's King Power stadium this evening The Leicester City owner's helicopter has crashed in a car park outside the club's ground shortly after taking off after a match. It is not kno… [+293 chars]"
		},
		{
			"source": {
				"id": "bbc-news",
				"name": "BBC News"
			},
			"author": "BBC News",
			"title": "Thousands protest Rome's run-down state",
			"description": "Demonstrators blame Mayor Virginia Raggi for the city's shoddy and creaking infrastructure.",
			"url": "http://www.bbc.co.uk/news/world-europe-46003670",
			"urlToImage": "https://ichef.bbci.co.uk/news/1024/branded_news/0C17/production/_104059030_tv050221216.jpg",
			"publishedAt": "2018-10-27T19:08:33Z",
			"content": "Image copyright AFP/Getty Image caption The hashtag \"romadicebasta\" (Rome says enough) has been trending on social media Thousands of people have taken to the streets of Rome to protest at the Italian capital's run-down state. Demonstrators gathered outside t… [+2254 chars]"
		},
		{
			"source": {
				"id": "bbc-news",
				"name": "BBC News"
			},
			"author": "BBC Sport",
			"title": "Glenn Hoddle: Ex-England manager 'responding well' after being taken seriously ill",
			"description": "Ex-England and Tottenham manager Glenn Hoddle is \"responding well\" to treatment after being taken to hospital in a serious condition earlier on Saturday.",
			"url": "http://www.bbc.co.uk/sport/football/46002170",
			"urlToImage": "https://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/818D/production/_104056133_gettyimages-1031554106.jpg",
			"publishedAt": "2018-10-27T18:48:44Z",
			"content": "Glenn Hoddle was a TV pundit at the 2018 World Cup and was pictured chatting to England players after their win over Colombia Ex-England and Tottenham manager Glenn Hoddle is \"responding well\" to treatment after being taken to hospital in a serious condition … [+2867 chars]"
		},
		{
			"source": {
				"id": "bbc-news",
				"name": "BBC News"
			},
			"author": "BBC News",
			"title": "Catalonia: Defending the republic",
			"description": "Catalan separatists are still defiant, a year after the failed independence referendum.",
			"url": "http://www.bbc.co.uk/news/world-europe-45939184",
			"urlToImage": "https://ichef.bbci.co.uk/news/1024/branded_news/205D/production/_104058280_p06q29n4.jpg",
			"publishedAt": "2018-10-27T18:23:32Z",
			"content": null
		}
	]
}
 */