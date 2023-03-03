def get_combinations ( num ) : return ( long ( num ) * ( num - 1 ) / 2 )
def get_root ( unionlist , index ) :
    if unionlist [ index ] [ 0 ] == index :
        return index
    return get_root ( unionlist , unionlist [ index ] [ 0 ] )
def get_size ( unionlist , index ) :
    if unionlist [ index ] [ 0 ] == index :
        return unionlist [ index ] [ 1 ]
    return get_size ( unionlist , unionlist [ index ] [ 0 ] )
def main ( ) :
    with open ( "/proc/sys/stdin" , "r" ) as sc :
        N , M = sc.read ( ).split ( "\n" )
        unionlist = [ ]
        inconvenience = [ ]
        edges = [ [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ] , [ ]