<template lang="html">
  <div class="">
    <h1>My Shopping List</h1>
    <list-item v-for="(item, index) in items" :key="index" :item="item"></list-item>
  </div>
</template>

<script>
import ListItem from './components/ListItem.vue';

export default {
  name: 'app',
  data(){
    return{
      items: [
        {name: 'Chicken', purchased: false},
        {name: 'Kestrel Lager', purchased: true},
        {name: 'Soft Furnishings', purchased: false}
      ]
    }
  },
  components: {
    'list-item': ListItem
  }
}
</script>

<style lang="css" scoped>
</style>
