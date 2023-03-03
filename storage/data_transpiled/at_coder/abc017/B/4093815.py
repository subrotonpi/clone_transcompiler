def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.CHOKU = ( 'ch' , 'o' , 'k' , 'u' )
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        while s :
            flag = False
            for end in self.CHOKU :
                if s.endswith ( end ) :
                    flag = True
                    s = s [ : - len ( end ) ]
                    break
            if not flag :
                print ( 'NO' )
                return
        print ( 'YES' )
