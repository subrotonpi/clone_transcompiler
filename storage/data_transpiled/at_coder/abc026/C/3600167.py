def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.readline ( ).strip ( )
            B = [ ]
            list = [ ]
            for i in range ( N + 1 ) :
                list.append ( list ( ) )
            for i in range ( 1 , N ) :
                B [ i ] = sc.readline ( ).strip ( )
                list [ B [ i ] - 1 ].append ( i )
            print ( get_money ( 0 , list ) )
        def get_money ( num , list ) :
            if len ( list [ num ] ) == 0 :
                return 1
            else :
                min = int ( list [ num ] [ 0 ] )
                max = 0
                for i in list [ num ] :
                    n = get_money ( i , list )
                    min = min ( min , n )
                    max = max ( max , n )
                return min + max + 1
    class LinkedList ( object ) :
        def __init__ ( self ) :
            self.link = [ ]
        def add ( self , vertex ) :
            self.link.append ( vertex )
        def get ( self ) :
            self.link.remove ( vertex )
        def view ( self ) :
            for vertex in self.link :
                print ( vertex )
        def linked ( self , vertex ) :
            if all ( vertex in self.link ) :
                return True
            else :
                return False
        def size ( self ) :
            return len ( self.link )
    return Main ( )
