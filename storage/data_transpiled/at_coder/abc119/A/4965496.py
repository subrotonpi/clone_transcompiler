def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.S = sys.stdin.read ( )
        def __call__ ( self , * args ) :
            self.S = os.path.realpath ( self.S )
            sps1 = self.S.split ( '/' )
            if int ( sps1 [ 0 ] ) > 2019 :
                print ( 'TBD' )
            elif int ( sps1 [ 0 ] ) == 2019 :
                if int ( sps1 [ 1 ] ) > 4 :
                    print ( 'TBD' )
                else :
                    print ( 'Heisei' )
            else :
                print ( 'Heisei' )
