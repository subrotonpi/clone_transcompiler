def import _solve
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.solve ( raw_input ( ) )
    def ex ( self ) :
        s = self.ex ( )
        par_count = 0
        for value in s :
            if value == 'p' :
                par_count += 1
        result = - par_count + len ( s ) / 2
        print ( result )
