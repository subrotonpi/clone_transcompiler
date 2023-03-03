def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.main = Main ( )
            self.solve ( )
        def solve ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                S = sc.read ( )
                sc.close ( )
                S = S.replace ( '2017' , '2018' )
                print ( S )
    return Main ( )
