def main ( ) :
    import os
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            ABCD = sc.read ( )
            strlist = ABCD.split ( '' )
            length = len ( ABCD ) - 1
            answer = ""
            ansnum = 0
            for i in range ( ( 1 << length ) ) :
                answer = strlist [ 0 ]
                ansnum = int ( strlist [ 0 ] )
                for j in range ( length ) :
                    if ( i >> j ) % 2 == 0 :
                        answer += "-" + strlist [ j + 1 ]
                        ansnum -= int ( strlist [ j + 1 ] )
                    else :
                        answer += "+" + strlist [ j + 1 ]
                        ansnum += int ( strlist [ j + 1 ] )
                if ansnum == 7 :
                    answer += "=7"
                    break
            print ( answer )
            sc.close ( )
    return Main
