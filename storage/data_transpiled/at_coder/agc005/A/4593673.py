def main ( ) :
    import sys
    from collections import deque
    from string import ascii_letters
    sc = Scanner ( )
    st = deque ( )
    x = sc.next ( )
    for ch in x :
        if ch == 'T' and not st.isleft ( ) and st.isright ( ) :
            st.popleft ( )
        else :
            st.append ( ch )
    print ( len ( st ) )
