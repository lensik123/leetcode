package leetCode.Medium;

public class CountOfIslands {

  public static void main(String[] args) {

    System.out.println(2 ^ 3);
    char[][] map1 = {
        {'1', '0', '1'},
        {'0', '0', '0'},
        {'1', '1', '1'}
    };
    char[][] map2 = {
        {'1', '1', '0'},
        {'1', '0', '0'},
        {'1', '1', '1'}
    };


  }

  public static int countOfIslands1(char[][] map){

    int count = 0;

    if (map == null){
      return 0;
    }

    for (int i = 0; i < map.length; i++){
      for (int j = 0; j < map[i].length; j++){
        if (map[i][j] == '1'){
          count += 1;

        }
      }
    }



    return count;

  }



}
