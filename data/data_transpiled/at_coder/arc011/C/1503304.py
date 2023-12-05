def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.first = sys.stdin.readline ( )
            self.last = sys.stdin.readline ( )
            self.n = len ( sys.stdin.readline ( ) )
            tango = [ ]
            for i in range ( 1 , n + 1 ) :
                tango.append ( sys.stdin.readline ( ) )
            tango.append ( first )
            tango.append ( last )
            lst = [ ]
            check = [ - 2 ]
            lst.append ( 0 )
            check.append ( - 1 )
            t = - 1
            while len ( lst ) != 0 :
                word = lst [ 0 ]
                lst.pop ( 0 )
                if tango [ word ] == last :
                    t = word
                    break
                for i in range ( 1 , n + 2 ) :
                    if check ( tango [ word ] , tango [ i ] ) and check [ i ] == - 2 :
                        lst.append ( i )
                        check.append ( word )
            if first == last :
                print ( 0 )
                print ( first )
                print ( last )
            elif t == - 1 :
                print ( - 1 )
            else :
                ans = [ ]
                tt = True
                while tt :
                    ans.insert ( 0 , tango [ t ] )
                    t = check [ t ]
                    if t == - 1 :
                        tt = False
                print ( len ( ans ) - 2 )
                for i in ans :
                    print ( i )
        def check ( a1 , a2 ) :
            t = 0
            for i in a1 :
                if i != a2 :
                    t += 1
            if t == 1 :
                return True
            else :
                return False
    return Main
