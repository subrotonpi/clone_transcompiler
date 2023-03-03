def main ( ) :
    import math
    import string
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.n_as_int = int ( self.n_as_int )
            self.count = 0
        def __call__ ( self , depth , current_depth , value ) :
            if depth == current_depth :
                if value <= n_as_int and str ( value ) in [ "3" , "5" , "7" ] :
                    self.count += 1
                return
            next_value = value + int ( math.pow ( 10 , current_depth ) * 7 )
            self.dfs ( depth , current_depth + 1 , next_value )
            next_value = value + int ( math.pow ( 10 , current_depth ) * 5 )
            self.dfs ( depth , current_depth + 1 , next_value )
            next_value = value + int ( math.pow ( 10 , current_depth ) * 3 )
            self.dfs ( depth , current_depth + 1 , next_value )
