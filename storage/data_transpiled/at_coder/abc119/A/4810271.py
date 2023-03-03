def main ( ) :
    from sys import argv
    class Main ( object ) :
        def __init__ ( self ) :
            self.main = Main ( )
            with open ( "/proc/sys/stdin" , "r" ) as sc :
                self.solve ( sc )
        def solve ( self ) :
            S = sc.read ( ).rstrip ( "/" )
            if int ( S ) <= 20190430 :
                print ( "Heisei" )
            else :
                print ( "TBD" )
    return Main
