// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet that returns some example content. TODO: modify this file to handle comments data */
@WebServlet("/data")
public class DataServlet extends HttpServlet {
private List<String> messages;

  @Override
  public void init() {
    messages = new ArrayList<>();
    messages.add("My favorite artists are Marilyn Manson and Björk.");
    messages.add("My favorite movies are A Clockwork Orange and The Shining, in that order.");
    messages.add("My favorite videogame series is God of War.");
    messages.add("I love horror movies and videogames.");
    messages.add("I love partying!");
    messages.add("I listen to music 24/7.");
    messages.add("My birthday is on November 19.");
    messages.add("I love art.");
    messages.add("I am a scorpio.");
    messages.add("I draw and paint watercolors.");
    messages.add("I love instagram.");
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String message = messages.get((int) (Math.random() * messages.size()));

    response.setContentType("text/html;");
    response.getWriter().println(message);
  }
}
