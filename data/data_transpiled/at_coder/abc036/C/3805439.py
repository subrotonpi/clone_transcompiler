def import _main
class Main ( object ) :
    def __init__ ( self , index , value ) :
        self.index = index
        self.value = value
    def __init__ ( self , index , value ) :
        self.index = index
        self.value = value
    def main ( self ) :
        sc = _main.sc
        N = sc.count ( )
        lst = [ ]
        for i in range ( N ) :
            index = i
            value = sc.get ( )
            p = ( index , value )
            lst.append ( p )
        lst.sort ( lambda a , b : a.value - b.value )
        before = sys.maxint
        nValue = - 1
        for i in lst :
            tmp = i.value
            if tmp != before :
                before = tmp
                nValue += 1
            i.value = nValue
        lst.sort ( lambda a , b : a.index - b.index )
        for i in lst :
            print ( i.value )
