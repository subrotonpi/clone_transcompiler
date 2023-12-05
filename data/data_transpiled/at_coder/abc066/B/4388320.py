def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.__main__ = __main__
    def __call__ ( self , * args ) :
        with self.__main__.open ( ) as sc :
            po = sc.read ( )
            if len ( po ) % 2 == 1 :
                po = po [ : - 1 ]
            else :
                po = po [ : - 2 ]
            while po != '' :
                if po [ : len ( po ) // 2 ] == po [ len ( po ) // 2 : ] :
                    break
                elif len ( po ) == 2 :
                    po = ''
                else :
                    po = po [ : - 2 ]
            print ( po )
