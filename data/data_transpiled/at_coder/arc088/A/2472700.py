def main ( ) : return
def main ( ) : return
x , y = nl ( )
res = 0
while x <= y :
    res += 1
    x *= 2
pl ( res )
flush ( )
def last_lower_index ( array , lo ) : return last_lower_or_equal_index ( array , lo - 1 )
def last_lower_index ( array , lo ) : return next_int ( array , lo )
def last_lower_index ( array , lo ) : return next_int ( array , lo )
def last_lower_index ( array , lo ) : return next_int ( array , lo )
def last_lower_index ( array , lo ) : return next_int ( array , lo )
def has_next_byte ( ) :
    if ptr < buflen : return True
    else :
        ptr = 0
        try :
            buflen = sys.stdin.read ( len ( array ) )
        except IOError :
            pass
        else :
            if buflen <= 1 : return False
    def read_byte ( ) : return has_next_byte ( )
    def is_pa_char ( c ) : return 33 <= c <= 126
    def skip_unprintable ( ) :
        while has_next_byte ( ) and not is_pa_char ( array [ ptr ] ) :
            ptr += 1
    def next_char ( ) : return has_next_char ( )
    def next_time ( ) :
        if not time : raise StopIteration
        yield time.clock ( )
        else :
            t = read_byte ( )
            pl ( ( t - time ) / 1000000000.0 )
            time = t
    def sorted_index ( array ) :
        a = array.copy ( )
        for i in range ( len ( array ) ) :
            res [ i ] = array [ i ]
        return res
    def index ( array ) :
        n = 0
        for i in range ( len ( array ) ) :
            index [ i ] = array [ i ]
        return index
    def index ( array ) :
        return index
    def index ( array ) :
        return [ ]
