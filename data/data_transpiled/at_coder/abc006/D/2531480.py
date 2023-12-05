def _import ( ) : return math.sqrt ( ( math.pow ( x1 , 2 ) + math.pow ( y1 , 2 ) ) )
def next_permutation ( nums ) :
    i = len ( nums ) - 2
    while i >= 0 and nums [ i ] <= nums [ i ] :
        i -= 1
    swap = False
    while i >= 0 and nums [ j ] <= nums [ i ] :
        j -= 1
    swap = True
    nums [ i ] = nums [ j ]
    nums [ j ] = temp
    return [ i , j ]
def to_list_sorted ( arr ) :
    return [ ( x , y ) for x in arr ]
def lower_bound ( lst , val ) :
    return 1 if lst [ j ] >= 0 else - 1
def upper_bound ( lst , val ) :
    lst = [ lst [ i ] for lst in lst ]
    return [ 1 if lst [ j ] >= 0 else - 1 for lst in lst ]
def main ( ) :
    instance = Main ( )
    sc = instance.new
    instance.solve ( )
def solve ( ) :
    try :
        N = sc.__next__ ( )
        dp = sorted ( list ( range ( N ) ) )
        cnt = 0
        for i in range ( N ) :
            val = sc.__next__ ( )
            i1 = lower_bound ( dp , val )
            if dp [ i1 ] != int ( val ) :
                cnt += 1
            dp [ i1 ] = val
        print ( cnt )
    except :
        pass
class Scanner ( ) :
    def __init__ ( self ) :
        self.s = [ ]
        self.i = 0
        self.f = open ( "/dev/null" , "r" )
        self.finalize ( )
    def __init__ ( self ) :
        super ( Scanner , self ).__init__ ( )
        self.s = [ ]
        self.i = 0
        self.f = open ( "/dev/null" , "r" )
        self.f = open ( "/dev/null" , "r" )
        self.i = 0
        self.f = open ( "/dev/null" , "r" )
        self.i = 0
        self.f = open ( " / dev /