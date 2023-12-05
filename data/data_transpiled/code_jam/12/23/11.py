def round1B ( ) :
    import os
    import os.path
    import time
    import os.path
    import os.path
    import os.path
    import os.path
    import time
    class C :
        class GotOne ( Exception ) :
            def __init__ ( self , size , subtotal , partial , dict ) :
                if not dict.get ( self.subtotal ) :
                    raise GotOne ( partial , dict [ self.subtotal ] )
                dict [ self.subtotal ] = set ( partial )
            else :
                for i in range ( index ) :
                    partial.add ( ( self.subtotal , i ) )
                    registerSubsets ( size - 1 , i + 1 , partial , dict )
                    partial.remove ( ( self.subtotal , i ) )
    def main ( ) :
        import time
        round = "1B"
        file = "C-large"
        f = open ( "round" + str ( round ) + "/" + file + ".in" , "r" )
        f = open ( "round" + str ( round ) + "/" + file + ".out." + time.ctime ( ) , "w" )
        T = int ( f.readline ( ) )
        for t in range ( 1 , T + 1 ) :
            line = f.readline ( ).split ( "s" )
            N = int ( line [ 0 ] )
            set = [ int ( line [ n + 1 ] ) for n in range ( N ) ]
            try :
                dict = { }
                for n in range ( 1 , N ) :
                    registerSubsets ( n , set , dict )
                print ( "Case #" + str ( t ) + ":" , " ".join ( line ) )
                print ( "Impossible" , file = f )
                print ( "Case #" + str ( t ) + ":" , file = f )
                print ( "Impossible" , file = f )
            except GotOne as e :
                print ( "Case #" + str ( t ) + ":" , file = f )
                print ( stringify ( e.one ) )
                print ( stringify ( e.another ) )
                print ( e.one )
                print ( e.another )