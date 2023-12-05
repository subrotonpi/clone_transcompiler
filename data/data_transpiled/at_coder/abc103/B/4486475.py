def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            str1 = ''
            str2 = ''
            str1 = str1.strip ( )
            if len ( str1 ) != len ( str2 ) :
                print ( 'No' )
                return
            while len ( str1 ) :
                s = ''
                c = str1 [ 0 ]
                s += str1 [ 1 : ] + c
                str1 = s
                if str1 == str2 :
                    print ( 'Yes' )
                    return
            print ( 'No' )
    return Main ( )
