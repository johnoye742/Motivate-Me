package com.johnoye742.motivateme;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends Activity implements View.OnClickListener {
TextView quote, author;
Button next, previous;
private static int ind;

private String[] quotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            setTheme(R.style.splash);
            Thread.sleep(2000);
            setTheme(R.style.Theme_MotivateMe);
        } catch (InterruptedException ignored) {

        }


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        quote = findViewById(R.id.quote);
        quote.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/MavenPro.ttf"));
        author = findViewById(R.id.author);
        author.setTypeface(Typeface.SERIF, Typeface.BOLD_ITALIC);
        next = findViewById(R.id.wb1);
        previous = findViewById(R.id.wb);
        next.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/MavenPro.ttf"));
        previous.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/MavenPro.ttf"));
        next.setOnClickListener(this);
        previous.setOnClickListener(this);
        findViewById(R.id.action_button).setOnClickListener(this);
        Toolbar tb = findViewById(R.id.tb);
        setActionBar(tb);
        String s = "All our dreams can come true, if we have the courage to pursue them./ – Walt Disney\nThe secret of getting ahead is getting started./ – Mark Twain\nI’ve missed more than 9,000 shots in my career. I’ve lost almost 300 games. 26 times I’ve been trusted to take the game winning shot and missed. I’ve failed over and over and over again in my life and that is why I succeed./ – Michael Jordan\nDon’t limit yourself. Many people limit themselves to what they think they can do. You can go as far as your mind lets you. What you believe, remember, you can achieve./ – Mary Kay Ash\nThe best time to plant a tree was 20 years ago. The second best time is now./ – Chinese Proverb\nOnly the paranoid survive./ – Andy Grove\nIt’s hard to beat a person who never gives up./ – Babe Ruth\nI wake up every morning and think to myself, ‘how far can I push this company in the next 24 hours.’/ – Leah Busque\nIf people are doubting how far you can go, go so far that you can’t hear them anymore./ – Michele Ruiz\nWe need to accept that we won’t always make the right decisions, that we’ll screw up royally sometimes – understanding that failure is not the opposite of success, it’s part of success./ – Arianna Huffington\nWrite it. Shoot it. Publish it. Crochet it, sauté it, whatever. MAKE./ – Joss Whedon\nYou’ve gotta dance like there’s nobody watching, love like you’ll never be hurt, sing like there’s nobody listening, and live like it’s heaven on earth./ ― William W. Purkey\nFairy tales are more than true: not because they tell us that dragons exist, but because they tell us that dragons can be beaten./― Neil Gaiman\n Everything you can imagine is real./― Pablo Picasso\nWhen one door of happiness closes, another opens; but often we look so long at the closed door that we do not see the one which has been opened for us./ ― Helen Keller\nDo one thing every day that scares you./― Eleanor Roosevelt\nIt’s no use going back to yesterday, because I was a different person then./― Lewis Carroll\nSmart people learn from everything and everyone, average people from their experiences, stupid people already have all the answers./ – Socrates\nDo what you feel in your heart to be right – for you’ll be criticized anyway./― Eleanor Roosevelt\nHappiness is not something ready made. It comes from your own actions./ ― Dalai Lama XIV\nWhatever you are, be a good one./ ― Abraham Lincoln\nThe same boiling water that softens the potato hardens the egg. It’s what you’re made of. Not the circumstances./ – Unknown\nIf we have the attitude that it’s going to be a great day it usually is./ – Catherine Pulsifier\nYou can either experience the pain of discipline or the pain of regret. The choice is yours./  – Unknown\nImpossible is just an opinion./ – Paulo Coelho\nYour passion is waiting for your courage to catch up./ – Isabelle Lafleche\nMagic is believing in yourself. If you can make that happen, you can make anything happen./ – Johann Wolfgang Von Goethe\nIf something is important enough, even if the odds are stacked against you, you should still do it./ – Elon Musk\nHold the vision, trust the process./ – Unknown\nDon’t be afraid to give up the good to go for the great./ – John D. Rockefeller\nPeople who wonder if the glass is half empty or full miss the point. The glass is refillable./ – Unknown\nNo one is to blame for your future situation but yourself. If you want to be successful, then become Successful./― Jaymin Shah\nThings may come to those who wait, but only the things left by those who hustle./― Abraham Lincoln\nEverything comes to him who hustles while he waits./― Thomas Edison\nEvery sucessful person in the world is a hustler one way or another. We all hustle to get where we need to be. Only a fool would sit around and wait on another man to feed him./ ― K’wan\nInvest in your dreams. Grind now. Shine later./ – Unknown\nHustlers don’t sleep, they nap./ – Unknown\nGreatness only comes before hustle in the dictionary./ – Ross Simmonds\nWithout hustle, talent will only carry you so far./ – Gary Vaynerchuk\nWork like there is someone working twenty four hours a day to take it away from you./ – Mark Cuban\nHustle in silence and let your success make the noise./ – Unknown\nWe are what we repeatedly do. Excellence, then, is not an act, but a habit./ – Aristotle\nIf you’re offered a seat on a rocket ship, don’t ask what seat! Just get on./ – Sheryl Sandberg\nI always did something I was a little not ready to do. I think that’s how you grow. When there’s that moment of ‘Wow, I’m not really sure I can do this,’ and you push through those moments, that’s when you have a breakthrough./ – Marissa Mayer\nIf you hear a voice within you say ‘you cannot paint,’ then by all means paint and that voice will be silenced./ – Vincent Van Gogh\nHow wonderful it is that nobody need wait a single moment before starting to improve the world./ – Anne Frank\nSome people want it to happen, some wish it would happen, others make it happen./ – Michael Jordan\nGreat things are done by a series of small things brought together/ – Vincent Van Gogh\nIf you hire people just because they can do a job, they’ll work for your money. But if you hire people who believe what you believe, they’ll work for you with blood and sweat and tears./ – Simon Sinek\nVery often, a change of self is needed more than a change of scene.’/ – A.C. Benson\nLeaders can let you fail and yet not let you be a failure./ – Stanley McChrystal\nIt’s not the load that breaks you down, it’s the way you carry it./ – Lou Holtz\nThe hard days are what make you stronger./ – Aly Raisman\nIf you believe it’ll work out, you’ll see opportunities. If you don’t believe it’ll work out, you’ll see obstacles./ – Wayne Dyer\nKeep your eyes on the stars, and your feet on the ground./ – Theodore Roosevelt\nYou can waste your lives drawing lines. Or you can live your life crossing them./ – Shonda Rhimes\nYou’ve got to get up every morning with determination if you’re going to go to bed with satisfaction./ – George Lorimer\nI now tried a new hypothesis: It was possible that I was more in charge of my happiness than I was allowing myself to be./ – Michelle Obama\nIn a gentle way, you can shake the world./ – Mahatma Gandhi\nIf opportunity doesn’t knock, build a door./ – Kurt Cobain\nDon’t be pushed around by the fears in your mind. Be led by the dreams in your heart./ – Roy T. Bennett\nWork hard in silence, let your success be the noise./ – Frank Ocean\nDon’t say you don’t have enough time. You have exactly the same number of hours per day that were given to Helen Keller, Pasteur, Michelangelo, Mother Teresa, Leonardo Da Vinci, Thomas Jefferson, and Albert Einstein./ – H. Jackson Brown Jr.\nHard work beats talent when talent doesn’t work hard./ – Tim Notke\nIf everything seems to be under control, you’re not going fast enough./ – Mario Andretti\nOpportunity is missed by most people because it is dressed in overalls and looks like work./ – Thomas Edison\nThe only difference between ordinary and extraordinary is that little extra./ – Jimmy Johnson\nThe best way to appreciate your job is to imagine yourself without one./ – Oscar Wilde\nUnsuccessful people make their decisions based on their current situations. Successful people make their decisions based on where they want to be./ – Benjamin Hardy\nNever stop doing your best just because someone doesn’t give you credit./ – Kamari aka Lyrikal\nWork hard for what you want because it won’t come to you without a fight. You have to be strong and courageous and know that you can do anything you put your mind to. If somebody puts you down or criticizes you, just keep on believing in yourself and turn it into something positive./ – Leah LaBelle\nWork hard, be kind, and amazing things will happen./ – Conan O’Brien\nThe miracle is not that we do this work, but that we are happy to do it./ – Mother Teresa\nNever give up on a dream just because of the time it will take to accomplish it. The time will pass anyway./ – Earl Nightingale\nIf you work on something a little bit every day, you end up with something that is massive./ – Kenneth Goldsmith\nThe big secret in life is that there is no secret. Whatever your goal, you can get there if you’re willing to work./ – Oprah Winfrey\nIf you cannot do great things, do small things in a great way./ – Napoleon Hill\nNever allow a person to tell you no who doesn’t have the power to say yes./ – Eleanor Roosevelt\nAt any given moment you have the power to say: this is not how the story is going to end./ – Unknown\nAmateus sit around and wait for inspiration. The rest of us just get up and go to work./ – Stephen King\nYour work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do. If you haven’t found it yet, keep looking. Don’t settle. As with all matters of the heart, you’ll know when you find it./ – Steve Jobs\nNothing will work unless you do./ – Maya Angelou\nSometimes when you’re in a dark place you think you’ve been buried but you’ve actually been planted./ – Christine Caine\nDon’t limit your challenges. Challenge your limits./ – Unknown\nWhenever you find yourself doubting how far you can go, just remember how far you have come./ – Unknown\nEveryone has inside them a piece of good news. The good news is you don’t know how great you can be! How much you can love! What you can accomplish! And what your potential is./ – Anne Frank\nSome luck lies in not getting what you thought you wanted but getting what you have, which once you have got it you may be smart enough to see is what you would have wanted had you known./ – Garrison Keillor\nDon’t quit yet, the worst moments are usually followed by the most beautiful silver linings. You have to stay strong, remember to keep your head up and remain hopeful./ – Unknown\nWhen written in Chinese the word crisis is composed of two characters – one represents danger and the other represents opportunity./ – John F Kennedy\nGood. Better. Best. Never let it rest. ‘Til your good is better and your better is best./ – St. Jerome.\nIn the middle of every difficulty lies opportunity./ – Albert Einstein\nStart where you are. Use what you have. Do what you can./ – Arthur Ashe\nDreams don’t work unless you do./ – John C. Maxwell\nGo the extra mile. It’s never crowded there./ – Dr. Wayne D. Dyer\nKeep your face always toward the sunshine – and shadows will fall behind you./ – Walt Whitman\nWhat defines us is how well we rise after falling./ – Lionel from Maid in Manhattan Movie\nH.O.P.E. = Hold On. Pain Ends./ - Unknown\nMake each day your masterpiece./ – John Wooden\nWherever you go, go with all your heart./ – Confucius\nTurn your wounds into wisdom./ – Oprah\nWe can do anything we want to if we stick to it long enough./ – Helen Keller";
        quotes = s.split("\n");

        quote.setText(gen(0)[0]);
      author.setText(gen(0)[1]);
    }

   public String[] gen(int i) {
       return quotes[i].split("/");
   }
  public void show(int index) {
      try {
          if(index == quotes.length) {
              ind = 0;
          }
          if(index < 1) {
            ind = quotes.length;
          }
          quote.setText(gen(index)[0]);
          author.setText(gen(index)[1]);
      } catch (Exception ignored) {

      }
  }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.wb:
                show(ind -= 1);
                break;
            case R.id.wb1:
                show(ind += 1);
                break;
            case R.id.action_button:
                Intent intent = new Intent(Intent.ACTION_SEND);
				intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, quote.getText().toString()+"\n"+author.getText().toString()+"\nFROM MOTIVATE ME APP BY JOHNOYE742");
                startActivity(Intent.createChooser(intent, "Share Quote"));
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.exit:
            finish();
            break;
            case R.id.credits:
                startActivity(new Intent(this, Splash.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}