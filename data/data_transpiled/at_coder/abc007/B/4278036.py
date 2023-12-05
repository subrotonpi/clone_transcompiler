def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
        def __str__ ( self ) :
            return ""
    A = Main ( )
    if len ( A ) > 1 :
        print ( A [ : - 1 ] )
        return
    s = "abcdefghijklmnopqrsuvwxyz"
    if A == "a" :
        print ( - 1 )
        return
    for w in s :
        if w < A :
            print ( w )
            return
