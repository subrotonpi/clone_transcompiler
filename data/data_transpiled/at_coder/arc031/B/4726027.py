def import _scanner
class Main ( object ) :
    def __init__ ( self , dx , dy ) :
        self.dx = [ 1 , 0 , - 1 , 0 ]
        self.dy = [ 0 , 1 , 0 , - 1 ]
    def dfs ( self , x , y , b ) :
        if self.b [ x ] [ y ] == 'x' : return
        self.b [ x ] [ y ] = 'x'
        for i in range ( 4 ) :
            nx = x + self.dx [ i ]
            ny = y + self.dy [ i ]
            if 0 <= nx < 10 and 0 <= ny < 10 :
                dfs ( nx , ny , b )
    def check ( self , x , y , b ) :
        self.dfs ( x , y , b )
        for i in range ( 10 ) :
            for j in range ( 10 ) :
                if b [ i ] [ j ] == 'o' : return False
        return True
    def main ( self ) :
        sc = _scanner ( )
        a = [ ]
        for i in range ( 10 ) :
            str = sc.next ( )
            for j in range ( 10 ) :
                a.append ( str [ j ] )
        flag = False
        for i in range ( 10 ) :
            for j in range ( 10 ) :
                b = [ ]
                for x in range ( 10 ) :
                    for y in range ( 10 ) :
                        b.append ( a [ x ] [ y ] )
                b.append ( 'o' )
                if check ( i , j , b ) :
                    flag = True
                    break
        print ( 'YES' if flag else 'NO' )
        sc.close ( )
