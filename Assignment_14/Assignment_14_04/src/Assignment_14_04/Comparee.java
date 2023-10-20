package Assignment_14_04;

@FunctionalInterface
interface Check<T>
{
	boolean Compare(T x,T y);
}