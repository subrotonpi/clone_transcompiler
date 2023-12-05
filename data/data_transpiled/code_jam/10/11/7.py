def import _main
class A ( object ) :
    def __init__ ( self , x , y , dx , dy , ch ) :
        for i in range ( K ) :
            curX = x + dx * i
            curY = y + dy * i
            if curX < 0 : return False
            if curY < 0 : return False
            if curX >= N : return False
            if curY >= N : return False
            if self.work [ curX ] [ curY ] != ch : return False
    def test ( self , x , y , dx , dy , ch ) :
        with open ( "test.txt" , "r" ) as f :
            self.case = f.read ( )
            for cases in range ( self.case ) :
                N = self.case
                K = self.case
                board = [ f.read ( ) ]
                self.work = [ [ ] for _ in range ( N ) ]
                for i in range ( self.case ) :
                    cur = self.case - 1
                    for j in range ( self.case ) :
                        while cur >= 0 and board [ i ] [ cur ] == '.' :
                            cur -= 1
                        if cur >= 0 :
                            self.work [ i ] [ j ] = board [ i ] [ cur ]
                            del self.work [ i ] [ j ]
                        else :
                            self.work [ i ] [ j ] = '.'
    redwin = bluewin = False
    for i in range ( self.case ) :
        for j in range ( self.case ) :
            if work [ i ] [ j ] == 'R' :
                if test ( i , j , 0 , 1 , 'R' ) : redwin = True
                if test ( i , j , 1 , 0 , 'R' ) : redwin = True
                if test ( i , j , 1 , 1 , 'R' ) : redwin = True
                if test ( i , j , 1 , - 1 , 'R' ) : redwin = True
                if test ( i , j , 1 , - 1 , 'R' ) : bluewin = True
            elif work [ i ] [ j ] == 'R' :
                if test ( i , j , 0 , 1 , '