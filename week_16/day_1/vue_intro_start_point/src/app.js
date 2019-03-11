import Vue from 'vue';

document.addEventListener('DOMContentLoaded', () => {
  new Vue({
    el: "#app",
    data: {
      greeting: "Hello World!"
    },
    methods: {
      updateGreeting: function(){
        this.greeting = "Changed!"
      }
    }
  });
});
