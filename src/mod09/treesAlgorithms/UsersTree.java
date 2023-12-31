package mod09.treesAlgorithms;

import java.util.Collection;

public interface UsersTree<Users> extends Collection<Users> {
  /** Return true if the element is in the tree */
  public boolean search(Users e);

  /** Insert element e into the binary tree
   * Return true if the element is inserted successfully */
  public boolean insert(Users e);

  /** Delete the specified element from the tree
   * Return true if the element is deleted successfully */
  public boolean delete(Users e);
  
  /** Get the number of elements in the tree */
  public int getSize();
  
  /** Inorder traversal from the root*/
  public default void inorder() {
  }

  /** Postorder traversal from the root */
  public default void postorder() {
  }

  /** Preorder traversal from the root */
  public default void preorder() {
  }
  
  @Override /** Return true if the tree is empty */
  public default boolean isEmpty() {
    return this.size() == 0;
  }

  @Override
  public default boolean contains(Object e) {
    return search((Users)e);
  }
  
  @Override
  public default boolean add(Users e) {
    return insert(e);
  }
  
  @Override
  public default boolean remove(Object e) {
    return delete((Users)e);
  }
  
  @Override
  public default int size() {
    return getSize();
  }
  
  @Override
  public default boolean containsAll(Collection<?> c) {
    // Left as an exercise
    return false;
  }

  @Override
  public default boolean addAll(Collection<? extends Users> c) {
    // Left as an exercise
    return false;
  }

  @Override
  public default boolean removeAll(Collection<?> c) {
    // Left as an exercise
    return false;
  }

  @Override
  public default boolean retainAll(Collection<?> c) {
    // Left as an exercise
    return false;
  }

  @Override
  public default Object[] toArray() {
    // Left as an exercise
    return null;
  }

  @Override
  public default <Users> Users[] toArray(Users[] array) {
    // Left as an exercise
    return null;
  }
}