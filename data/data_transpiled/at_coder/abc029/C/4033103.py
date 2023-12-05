def import solve
class Main ( object ) :
    def __init__ ( self , n ) :
        Scanner ( ).__init__ ( self )
        N = sc.nextInt ( )
        S = ""
        solve ( N , S )
    def solve ( self , n , s ) :
        if n == 0 :
            print ( s )
        else :
            self.solve ( n - 1 , s + "a" )
            self.solve ( n - 1 , s + "b" )
            self.solve ( n - 1 , s + "c" )
