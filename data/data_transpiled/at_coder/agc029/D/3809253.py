def _import ( ) : return sys.stdin.read ( )
import string
import tokenize
import tokenize
import function
class Main ( object ) :
    def __init__ ( self , f ) :
        self.f = f
    def readline ( self ) :
        try :
            self.f = tokenize.open ( self.f )
        except tokenize.TokenError :
            raise
        next = next
        self.f = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
        self.next = next
    def debug ( self , * args ) :
        j = string.join ( " " )
        for arg in args :
            if isinstance ( arg , int ) :
                j += [ str ( arg ) ]
            elif isinstance ( arg , long ) :
                j += [ str ( arg ) ]
            elif isinstance ( arg , float ) :
                j += [ str ( arg ) ]
            elif isinstance ( arg , tuple ) :
                j += [ str ( arg ) ]
            else :
                j += [ str ( arg ) ]
        print ( j )
for cur in range ( 0 , W ) :
    h = 0
    ans = sys.maxsize
    for w in range ( W ) :
        ceil = _find_ceil ( h , w , HS_ON_W )
        ans = min ( ceil , ans )
        if h + 1 == ceil :
            break
        space = _find_space ( h , w + 1 , HS_ON_W )
        if space == - 1 :
            break
        h = space
    return ans
