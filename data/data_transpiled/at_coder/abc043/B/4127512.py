def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        str = sc.next ( )
        while True :
            tmp = str.replace ( "1B" , "" ).replace ( "0B" , "" )
            if tmp == str :
                break
            str = tmp
        print ( str.replace ( "B" , "" ) )
