# JAICF Bot template

Here is a ready to use JAICF bot template that can be run locally or deployed to Heroku server and connected to Google Assistant.

## How to use

You can use this template locally on your PC or deploy it on Heroku server.

### Run locally

To run this project locally just create a new project from source codes in IntelliJ IDEA and run `Server.kt`.
This will start the server on port 8080. 

#### Obtain global URL

You can then propagate your local instance to the Internet using [ngrok](https://ngrok.com/).
And then run `ngrok http 8080` in the terminal to obtain public URL.

Copy this URL then and use it as a fulfillment URL in your [Dialogflow](https://dialogflow.com) agent (see below).

### Deploy to Heroku

Just click on the button below to deploy this template on Heroku server.

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://heroku.com/deploy)

1. After deployment open the app and copy the URL of the app to clipboard.
2. Then go to [Dialogflow](https://dialogflow.com), create a new agent and setup a fulfillment URL.
3. Enable fulfillment for every intent in you agent.
4. Click on _Google Assistant_ link on the left side bar to create a new Google Assistant Action connected to your Dialogflow agent.
5. That's it! You now can start the app and see how you server responds with some responses.

### How to upload code changes to Heroku

Please make the next steps to upload your changes on Heroku.

Install [git](https://git-scm.com/downloads) and [Heroku CLI](https://devcenter.heroku.com/articles/heroku-cli#download-and-install).
Run a terminal (or console) on your machine and type

```
heroku login
heroku git:clone -a <your Heroku application name>
cd <your Heroku application name>
git remote add origin https://github.com/just-ai/jaicf-template
git pull origin master
```

_You have to do these steps only once._

Once you are ready to upload your changes to Heroku, just type

```
git add .
git commit -am "some comments"
git push
```

Heroku will build and deploy your changes automatically.

### Data persistence

This template uses mongoDB persistence layer available on Heroku.
Heroku automatically creates a free sandbox database hosted by MongoLab.

During the local development a simple in-memory storage is used.