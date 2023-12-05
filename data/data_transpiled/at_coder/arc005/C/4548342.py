def import sys
class Main ( object ) :
    def __init__ ( self , x , y , cnt ) :
        self.x , self.y , self.cnt = x , y , cnt
    mx = [ 1 , 0 , - 1 , 0 ]
    my = [ 0 , 1 , 0 , - 1 ]
    def main ( sc ) :
        try :
            with open ( sc , 'r' ) as sc :
                eval ( sc )
        except :
            raise
    def main ( ) :
        mx = [ 0 , 1 , 0 ]
        my = [ 0 , 1 , 0 , - 1 ]
    def main ( ) :
        h , w = sc.readline ( ).split ( )
        map = [ ]
        queue = deque ( )
        gx , gy = - 1 , - 1
        for i , s in enumerate ( sc ) :
            for j , i in enumerate ( sc ) :
                if s == '.' :
                    map.append ( [ i , j , 0 ] )
                elif s == 's' :
                    queue.append ( ( j , i , 0 ) )
                elif s == 'g' :
                    gx , gy = j , i
                else :
                    map.append ( [ i , j , - 1 ] )
        data = [ ]
        for i in range ( h ) :
            data.append ( [ 3 , 3 ] )
        while not queue.empty ( ) :
            human = queue.popleft ( )
            if data [ human.y ] [ human.x ] <= human.cnt :
                continue
            if human.x == gx and human.y == gy :
                print ( 'YES' )
                return
            if map [ human.y ] [ human.x ] == 0 :
                data [ human.y ] [ human.x ] = human.cnt
            for i in range ( 4 ) :
                nx = human.x + mx [ i ]
                ny = human.y + my [ i ]
                if nx >= 0 and nx < w and ny >= 0 and ny < h and data [ ny ] [ nx ] > human.cnt :
                    if human.cnt < 2 :
                        queue.append ( ( nx , ny , human.cnt ) )
                