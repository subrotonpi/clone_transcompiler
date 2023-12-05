def f ( a ) :
    import sys
    import os
    def f ( a ) :
        if a % 2 == 0 :
            return a / 2
        else :
            return 3 * a + 1
    def main ( ) :
        sc = os.popen ( "cat " + str ( a ) + " " + str ( a ) )
        s = sc.read ( )
        if sc.close ( ) :
            data = [ ]
            while 1 :
                index = data.index ( s )
                data.append ( s )
                if index == - 1 :
                    s = f ( s )
                else :
                    break
            print ( len ( data ) )
        return s
    return main
