package com.rizki3012.digitalmarketingtactics.model;

import com.rizki3012.digitalmarketingtactics.R;

import java.util.ArrayList;

public class TacticData {

    private static String[] tacticTitles = {
            "SEO",
            "Search Engine Marketing",
            "Local Search Marketing",
            "Content Marketing",
            "Remarketing",
            "Responsive Web Design",
            "Email Marketing",
            "Social Media Marketing",
            "Marketing Automation",
            "Influencer Marketing",
            "Video",
            "Revisiting Your Landing Pages"
    };

    private static String[] tacticDetails = {
            "There isn’t anything more important to digital marketing than SEO, something that might still mystify you in its ongoing complexity. While it’s true Google’s algorithms can still become confusing, you can better grasp how it works when you work more with the concept.\n" +
                    "\nIt’s always better to have an expert to manage SEO for you if you want to truly succeed. While you can learn some basics, you’ll want someone who’s worked in it a while to fully help you realize the best strategies.\n" +
                    "\nOne recent strategy involves new HTTPS requirements already impacting SEO results. If you’re used to using HTTP pages, Google now suggests you to switch to a HTTPS format. The reasoning behind this is many contact forms using HTTP pages aren’t deemed secure enough.\n" +
                    "\nNow that Google is going to label these “non-secure”, it’s essential to update your website with the HTTPS designation. Otherwise, having a “non-secure” stamp on your site could become a new scarlet letter for your placement on search engines.\n" +
                    "\nAn expert SEO and digital marketing specialist helps you make this change.",
            "If you’re new to search engine marketing, you’ll usually see it abbreviated as SEM. It’s a form of Internet marketing where you increase your SERPs through paid advertising methods.\n" +
                    "\nYou’ll want an expert to help you in this field as well, especially one who’s worked with Google Ads and search/display ads. In the case of Google Ads, you’ll want to educate yourself first on how the process works.\n" +
                    "\nWhat you’ll appreciate the most is Google makes their Google Ads easy to use through their attention to customization. They let you choose whether you want graphic display ads, YouTube video ads, text-based search ads, or in-app mobile ads. All of these are going to depend on your business style and the targeted customers you need to reach.\n" +
                    "\nGoogle makes it even easier with localized ad capability, plus superior metrics to track how well your ads work.\n" +
                    "\nDon’t forget about other paid ad opportunities, especially Facebook Ads. The latter gives you ample opportunity to customize to multiple ad formats.",
            "You’re seeing a lot more attention on local search marketing the last few years. It’ll continue being important far into the coming decade as local businesses realize the value in being found by local consumers.\n" +
                    "\nTo get started with local search marketing, you can again utilize more gifts from Google. Through Google My Business, you’ll be able to have your listing turn up the second someone does a Google search based on the user’s keywords. This includes your business appearing on Google Maps.\n" +
                    "\nGoogle makes it easy to update your listing as well so nothing becomes out of date.\n" +
                    "\nDon’t forget about how important online reviews are, as well as your social reputation. You’ll want to inspire customers to write positive reviews on places like Yelp. On social media, starting conversations and posting targeted content helps you utilize inbound marketing. Inbound techniques attract customers to you rather than you seeking them.",
            "As a connective string to inbound marketing above, content marketing is a big part of attracting a targeted audience. What’s essential about content marketing is that you need to make your content valuable, relevant, and consistent to make it worth the time of those consuming it.\n" +
                    "\nIn today’s time, you need to focus on creating content that can solve pain points and stay evergreen. Using shortcuts or black hat SEO tactics just to move to the top of search engines won’t work thanks to Google’s all-seeing eye.\n" +
                    "\nSo always keep “content as king”, as many like to put it. To make content marketing work well, you need to focus on mobile content, native advertising, influencer marketing, and marketing automation.\n" +
                    "\nThink seriously about mobile content because smartphones are already making up 50% of all global devices. This is going to affect digital advertising, and how influencers promote your brand.\n" +
                    "Automation tools send content to prospects on their mobile devices at just the right times.",
            "Another critical aspect to digital marketing is going after prospects again with marketing content if they didn’t respond to your site’s banner ads the first time. This works by tracking these visitors through cookies and creating new ads on related sites.\n" +
                    "\nYou can also create new ads on your site to better target your prospects. The information you get from your site visitors gives you valuable data to tweak your ads to their pain points.\n" +
                    "\nUltimately, remarketing helps you stay more engaged with prospects, aids in brand awareness, and increases conversions. You can also gain the customers of your competitors, helping pay back any investment you place in creating new ads.",
            "Reaching customers by mobile is more or less the standard now, and that’s going to go on into the coming decade. Making your website conform to mobile screens is one of the most essential parts of digital marketing. The only way you can make this work successfully is through responsive web design.\n" +
                    "\nWith responsive programming, you can make your website automatically conform to all mobile screens. This is going to mean more than one format, including tablets and increasing use of smartwatches.\n" +
                    "\nWhile you’ll have to work with a web designer to make this work, you’ll want an SEO expert for another aspect of RWD. AMP (or Accelerated Mobile Pages) is a new open-source code helping to make mobile web pages load faster.\n" +
                    "\nGoogle gives precedence to websites using this, so take it seriously. It’s especially useful if you have a publishing site or post content to your website on a regular basis.",
            "No doubt you’ve done some email marketing, but how effective is it in reaching your intended targets at the right times? Email marketing is already a great tool for generating more leads than possible through any other marketing method. You can also increase your sales and conversion rates.\n" +
                    "\nIf you’re already suffering from overspending on other digital marketing, email marketing is one of the most affordable methods out there. In some cases, it’s free, unless using outsourced services.\n" +
                    "\nSince you can combine it with other media, it’s also one of the most integrated marketing methods. You can add social share icons, plus referral reward systems. Email marketing ultimately helps you shorten your sales cycles when using compelling content.",
            "No doubt you’ve posted content to social media already. Yet, what can you do to make it more effective this year and the next?\n" +
                    "\nTo capture today’s audiences, Forbes notes various things, including automation to post your content when you know your audience is reading. Using tools like Hootsuite for post scheduling helps immensely when reaching users in other time zones.\n" +
                    "\nYou’ll also want to curate some content if possible to prove your clout. Don’t be too proud to do this since it adds luster to your expertise and brand. When you curate content from others, they’ll likely reciprocate.\n" +
                    "\nPlus, don’t forget about hiring influencers to post content for you on popular social media channels.",
            "As you can see, marketing automation is an important element in a lot of digital marketing techniques. Knowing more about it in general should become a top priority as it becomes a standard for businesses around the globe.\n" +
                    "\nWith 91% of successful businesses now saying automation is very important to their success, you can get a vision of what the present and future of marketing is.\n" +
                    "\nTo become successful with this, try looking for a CRM platform with marketing automation built in. These can work together well because your CRM already has contact information. Automating marketing content directly to your contact list helps you integrate your marketing all in one place rather than using disparate sources.\n" +
                    "\nWhat’s most important with automation is to keep your content consistent across all channels to avoid brand confusion.",
            "Have you thought about how you can take on a digital marketing campaign without having to spend a fortune? While you can save money doing email marketing and inbound techniques, hiring influencers does the same.\n" +
                    "\nIf you think hiring influencers to promote your brand online is all about hiring celebrities, think again. An influential person on social media doesn’t always have to mean being a celebrity. It can simply be someone with a lot of followers and a good track record of promoting products.\n" +
                    "\nForbes notes you need to identify top influencers first, which is going to involve a little research. You can do this doing hashtag searches on places like Twitter to see what people are saying about topics related to your industry.\n" +
                    "\nReach out to these influencers on social media and ask them if they’d be willing to promote your brand. Some may offer to do it in exchange for free products. However, most are going to demand a fee.\n" +
                    "\nBe sure to track your results to assure your ROI. Keep in mind those with fewer followers can have just as much influence as those with ten times the amount of followers.",
            "Over the last decade, we became a more visual culture attracted to imagery in the digital realms. A lot of this comes in various forms, but there isn’t any question video rose to the top.\n" +
                    "\nWe’re at the point now where more consumers of content prefer video above any other visual medium. Recent statistics show 87% of all online marketers now use video content of some sort.\n" +
                    "\nA lot of this comes from massive viewership on places like YouTube. Regardless, where you post videos isn’t going to matter without compelling content.\n" +
                    "\nMore personalized video has become a norm lately, or at least ones directly addressing pain points of targeted viewers. The same goes with making your business look more human.\n" +
                    "\nSuccessful video marketing can mean behind-the-scenes tours of your business, or testimonials to show the human side of your brand.  This means paying attention to one major trend in video marketing: Storytelling.\n" +
                    "\nWhen you can tell a compelling story about your business and prove you can solve pain points of customers, you have a can’t-miss formula.\n" +
                    "\nIt’s also smart to keep your videos as short as possible, if not in a series. Attention spans are as short as ever, and you’ll need to tell your story in a compact way with a compelling hook.",
            "If you’ve already created a landing page as part of your digital marketing campaign, are you sure prospects who visited before are going to come back?\n" +
                    "\nThis is a question that should become the central core of your digital marketing efforts. All marketing experts reiterate how landing page traffic is the nucleus of successful inbound marketing.\n" +
                    "\nThe problem is your landing page perhaps isn’t very enticing at the moment. Solving this (in part) comes down to web design, including where you place your Call to Action and advertising.\n" +
                    "\nIt goes beyond what you place on your website, though. You’ll want to invest in PPC advertising (pay-per-click) to place ads for your site on related digital channels.\n" +
                    "\nOther options include buying sponsorships with other companies, or just simple email marketing. In the latter case, placing a link that takes the reader to your landing page for further content is a common strategy.\n" +
                    "\nFor CTA’s, be sure to include one on your homepage to avoid complication. Even a CTA at the end of your blog gives a connective string to your content to entice another visitation.\n" +
                    "\nPlus, pay attention to the “above vs. below the fold” debates. Kissmetrics once noted that CTA placement depends on the length of your landing page. A shorter page means you should place the CTA above the folder."
    };

    private static int[] tacticImages = {
            R.drawable.seo,
            R.drawable.search_engine_marketing,
            R.drawable.local_seo_search,
            R.drawable.content_marketing,
            R.drawable.remarketing,
            R.drawable.responsive_web_design,
            R.drawable.email_marketing,
            R.drawable.social_media_marketing,
            R.drawable.marketing_automation,
            R.drawable.influencer_marketing,
            R.drawable.video,
            R.drawable.landing_page
    };

    public static ArrayList<Tactic> getListData() {
        ArrayList<Tactic> list = new ArrayList<>();
        for (int position = 0; position < tacticTitles.length; position++ ){
            Tactic tactic = new Tactic();
            tactic.setTitle(tacticTitles[position]);
            tactic.setDetail(tacticDetails[position]);
            tactic.setPhoto(tacticImages[position]);
            list.add(tactic);
        }
        return list;
    }

}
