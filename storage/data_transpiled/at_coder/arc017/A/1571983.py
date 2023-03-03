def import input
class Main ( object ) :
    def __init__ ( self ) :
        self.n = input ( )
    def main ( self ) :
        self.n = input ( )
        flag = True
        for i in range ( 2 , n // 2 + 1 ) :
            if n % i == 0 :
                print ( "NO" )
                flag = False
                break
        if flag :
            print ( "YES" )
