def _ ( ) :
    import sys
    import decimal
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            word = sc.readline ( )
            ngWord = [ 'a' , 'i' , 'u' , 'e' , 'o' ]
            for data in ngWord :
                word = word.replace ( data , '' )
            print ( word )
    return Main
